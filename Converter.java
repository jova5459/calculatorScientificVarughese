public class Converter {


    public static double convertLength(double length, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Meters
                switch (targetUnit) {
                    case 1: // Meters
                        return length;
                    case 2: // Centimeters
                        return length * 100;
                    case 3: // Feet
                        return length * 3.28084;
                    case 4: // Inches
                        return length * 39.3701;
                    case 5: // Nanometers
                        return length * 1000000000;
                    case 6: // Microns
                        return length * 1000000;
                    case 7: // Millimeters
                        return length * 1000;
                    case 8: // Kilometers
                        return length / 1000;
                    case 9: // Yards
                        return length * 1.0936133;
                    case 10: // Miles
                        return length / 1609.344;
                    case 11: // Nautical Miles
                        return length / 1852;
                }
                break;


            case 2: // centimeters
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 100;
                    case 2: // Centimeters
                        return length;
                    case 3: // Feet
                        return length / 30.48;
                    case 4: // Inches
                        return length / 2.54;
                    case 5: // Nanometers
                        return length * 10000000;
                    case 6: // Microns
                        return length * 10000;
                    case 7: // Millimeters
                        return length * 10;
                    case 8: // Kilometers
                        return length / 100000;
                    case 9: // Yards
                        return length / 91.44;
                    case 10: // Miles
                        return length / 160934.4;
                    case 11: // Nautical Miles
                        return length / 185200;
                }
                break;
            case 3: // feet
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 3.2808399;
                    case 2: // Centimeters
                        return length * 30.48;
                    case 3: // Feet
                        return length;
                    case 4: // Inches
                        return length * 12;
                    case 5: // Nanometers
                        return length * 3.04800000000;
                    case 6: // Microns
                        return length * 304800;
                    case 7: // Millimeters
                        return length * 304.8;
                    case 8: // Kilometers
                        return length / 3280.8399;
                    case 9: // Yards
                        return length / 3;
                    case 10: // Miles
                        return length / 5280;
                    case 11: // Nautical Miles
                        return length / 6076.11549;
                }
                break;
            case 4: // inches
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 39.3700787;
                    case 2: // Centimeters
                        return length * 2.54;
                    case 3: // Feet
                        return length / 12;
                    case 4: // Inches
                        return length;
                    case 5: // Nanometers
                        return length * 2.540000000;
                    case 6: // Microns
                        return length * 25400;
                    case 7: // Millimeters
                        return length * 25.4;
                    case 8: // Kilometers
                        return length / 39370.0787;
                    case 9: // Yards
                        return length / 36;
                    case 10: // Miles
                        return length / 63360;
                    case 11: // Nautical Miles
                        return length / 72913.3858;
                }
                break;
            case 5: // nanometers
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 1000000000;
                    case 2: // Centimeters
                        return length / 10000000;
                    case 3: // Feet
                        return length / 3.280800000000;
                    case 4: // Inches
                        return length / 3.9370;
                    case 5: // Nanometers
                        return length;
                    case 6: // Microns
                        return length * 1000;
                    case 7: // Millimeters
                        return length * 1000000;
                    case 8: // Kilometers
                        return length / 1000000000;
                    case 9: // Yards
                        return length / 1.093600000000;
                    case 10: // Miles
                        return length / 6.2137000000000000;
                    case 11: // Nautical Miles
                        return length / 5.3996000000000000;
                }
                break;
            case 6: // microns
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 1000000;
                    case 2: // Centimeters
                        return length / 10000;
                    case 3: // Feet
                        return length / 304800;
                    case 4: // Inches
                        return length / 25400;
                    case 5: // Nanometers
                        return length * 1000;
                    case 6: // Microns
                        return length;
                    case 7: // Millimeters
                        return length / 1000;
                    case 8: // Kilometers
                        return length / 1000000000;
                    case 9: // Yards
                        return length / 914400;
                    case 10: // Miles
                        return length / 1.6093;
                    case 11: // Nautical Miles
                        return length / 1.8520;
                }
                break;
            case 7: // millimeters
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 1000;
                    case 2: // Centimeters
                        return length / 10;
                    case 3: // Feet
                        return length / 304.8;
                    case 4: // Inches
                        return length / 25.4;
                    case 5: // Nanometers
                        return length * 1000000;
                    case 6: // Microns
                        return length * 1000;
                    case 7: // Millimeters
                        return length;
                    case 8: // Kilometers
                        return length / 1000000;
                    case 9: // Yards
                        return length / 914.4;
                    case 10: // Miles
                        return length / 1.6093;
                    case 11: // Nautical Miles
                        return length / 1852000;
                }
                break;
            case 8: // kilometers
                switch (targetUnit) {
                    case 1: // Meters
                        return length * 1000;
                    case 2: // Centimeters
                        return length * 100000;
                    case 3: // Feet
                        return length * 3280.8399;
                    case 4: // Inches
                        return length * 39370.0787;
                    case 5: // Nanometers
                        return length * 1000000000;
                    case 6: // Microns
                        return length * 100000000;
                    case 7: // Millimeters
                        return length * 1000000;
                    case 8: // Kilometers
                        return length;
                    case 9: // Yards
                        return length * 1093.6133;
                    case 10: // Miles
                        return length / 1.609344;
                    case 11: // Nautical Miles
                        return length / 1.852;
                }
                break;
            case 9: // yards
                switch (targetUnit) {
                    case 1: // Meters
                        return length / 1.0936133;
                    case 2: // Centimeters
                        return length * 91.44;
                    case 3: // Feet
                        return length * 3;
                    case 4: // Inches
                        return length * 36;
                    case 5: // Nanometers
                        return length * 9.14400000000;
                    case 6: // Microns
                        return length * 914400;
                    case 7: // Millimeters
                        return length * 914.4;
                    case 8: // Kilometers
                        return length / 1093.6133;
                    case 9: // Yards
                        return length;
                    case 10: // Miles
                        return length / 1760;
                    case 11: // Nautical Miles
                        return length / 2025.37183;
                }
                break;
            case 10: // miles
                switch (targetUnit) {
                    case 1: // Meters
                        return length * 1609.344;
                    case 2: // Centimeters
                        return length * 160934.4;
                    case 3: // Feet
                        return length * 5280;
                    case 4: // Inches
                        return length * 63360;
                    case 5: // Nanometers
                        return length * 1.6093000000000000;
                    case 6: // Microns
                        return length * 1.6093000000000;
                    case 7: // Millimeters
                        return length * 1.6093000000;
                    case 8: // Kilometers
                        return length / 1.609344;
                    case 9: // Yards
                        return length * 1760;
                    case 10: // Miles
                        return length;
                    case 11: // Nautical Miles
                        return length / 1.15077945;
                }
                break;
            case 11: // nautical miles
                switch (targetUnit) {
                    case 1: // Meters
                        return length * 1852;
                    case 2: // Centimeters
                        return length * 185200;
                    case 3: // Feet
                        return length * 6076.11549;
                    case 4: // Inches
                        return length * 72913.3858;
                    case 5: // Nanometers
                        return length * 1.852000000000000;
                    case 6: // Microns
                        return length * 1.852000000000;
                    case 7: // Millimeters
                        return length * 1852000;
                    case 8: // Kilometers
                        return length / 1.852;
                    case 9: // Yards
                        return length * 2025.37183;
                    case 10: // Miles
                        return length * 1.15077945;
                    case 11: // Nautical Miles
                        return length;
                }
                break;
        }
        return 0.0; // Default if units are not recognized
    }
}
