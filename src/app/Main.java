package app;

import gui.GUIFactory;
import gui.MacOSFactory;
import gui.WindowsFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Delivery mode (ROAD/SEA): ");
        String modeInput = scanner.nextLine().trim().toUpperCase();
        System.out.print("UI platform (WINDOWS/MACOS): ");
        String platformInput = scanner.nextLine().trim().toUpperCase();

        try {
            Logistics logistics = configureLogistics(modeInput);
            GUIFactory guiFactory = configureGUI(platformInput);
            DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
            System.out.println();
            app.run("laboratory equipment", "Aktau warehouse");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Stopping application due to invalid configuration.");
        } finally {
            scanner.close();
        }
    }

    private static Logistics configureLogistics(String mode) {
        return switch (mode) {
            case "ROAD" -> new RoadLogistics();
            case "SEA" -> new SeaLogistics();
            default -> throw new IllegalArgumentException("Validation error: Unsupported delivery mode '" + mode + "'.");
        };
    }

    private static GUIFactory configureGUI(String platform) {
        return switch (platform) {
            case "WINDOWS" -> new WindowsFactory();
            case "MACOS" -> new MacOSFactory();
            default -> throw new IllegalArgumentException("Validation error: Unsupported platform '" + platform + "'.");
        };
    }
}