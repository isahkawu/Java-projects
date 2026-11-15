import java.util.Scanner;

public class Nokia5510 {

static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

    while (true) {

        System.out.println("\n====== NOKIA PHONE MENU ======");
        System.out.println("1. Contacts");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call Register");
        System.out.println("5. Tone Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call Divert");
        System.out.println("8. Music");
        System.out.println("9. Games");
        System.out.println("10. Calculator");
        System.out.println("11. Reminders");
        System.out.println("12. Clock");
        System.out.println("13. Profiles");
        System.out.println("14. WAP Services");
        System.out.println("15. Call");
        System.out.println("16. Exit");

        System.out.print("Select an option: ");
        String choice = input.nextLine();

       switch (choice) {

           // CONTACTS
        case "1": {
                contactsMenu:
                while (true) {

                    System.out.println("\n===== CONTACTS =====");
                    System.out.println("1. View Contacts");
                    System.out.println("2. Add Contact");
                    System.out.println("3. Search Contact");
                    System.out.println("4. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("No contacts available.");
                            break;

                        case "2":
                            System.out.print("Enter contact name: ");
                            String name = input.nextLine();

                            System.out.print("Enter phone number: ");
                            String number = input.nextLine();

                        System.out.println(name + " has been added successfully.");
                            break;

                        case "3":
                            System.out.print("Enter name to search: ");
                            String searchName = input.nextLine();

                            System.out.println("Searching for " + searchName);
                            break;

                        case "4":
                            break contactsMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // MESSAGES
            case "2": {
                messagesMenu:
                while (true) {

                    System.out.println("\n===== MESSAGES =====");
                    System.out.println("1. Inbox");
                    System.out.println("2. Create Message");
                    System.out.println("3. Sent Messages");
                    System.out.println("4. Outbox");
                     System.out.println("5. Picture message  ");
                     System.out.println("6. Back");
                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Your inbox is empty.");
                            break;

                        case "2":
                            System.out.print("Enter your message: ");
                            String message = input.nextLine();

                            System.out.println("Message created: " + message);
                            break;

                        case "3":
                            System.out.println("No sent messages.");
                            break;

                        case "6":
                            break messagesMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CHAT
            case "3": {
                chatMenu:
                while (true) {

                    System.out.println("\n===== CHAT =====");
                    System.out.println("1. Start New Chat");
                    System.out.println("2. View Chats");
                    System.out.println("3. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.print("Enter recipient name: ");
                            String recipient = input.nextLine();

                            System.out.print("Type your message: ");
                            String chatMessage = input.nextLine();

                            System.out.println("Message sent to " + recipient);
                            break;

                        case "2":
                            System.out.println("No chats available.");
                            break;

                        case "3":
                            break chatMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CALL REGISTER
            case "4": {
                callRegisterMenu:
                while (true) {

                    System.out.println("\n===== CALL REGISTER =====");
                    System.out.println("1. Missed Calls");
                    System.out.println("2. Received Calls");
                    System.out.println("3. Dialled Numbers");
                    System.out.println("4. Delete Recent Calls");
                    System.out.println("5. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("No missed calls.");
                            break;

                        case "2":
                            System.out.println("No received calls.");
                            break;

                        case "3":
                            System.out.println("No dialled numbers.");
                            break;

                        case "4":
                            System.out.println("Recent calls deleted.");
                            break;

                        case "5":
                            break callRegisterMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // TONE TONES
            case "5": {
                toneMenu:
                while (true) {

                    System.out.println("\n===== TONE TONES =====");
                    System.out.println("1. Ringing Tone");
                    System.out.println("2. Ringing Volume");
                    System.out.println("3. Message Alert Tone");
                    System.out.println("4. Keypad Tones");
                    System.out.println("5. Warning Tones");
                    System.out.println("6. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Ringing tone selected.");
                            break;

                        case "2":
                            System.out.println("Adjusting ringing volume.");
                            break;

                        case "3":
                            System.out.println("Message alert tone selected.");
                            break;

                        case "4":
                            System.out.println("Keypad tones activated.");
                            break;

                        case "5":
                            System.out.println("Warning tones activated.");
                            break;

                        case "6":
                            break toneMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // SETTINGS
            case "6": {
                settingsMenu:
                while (true) {

                    System.out.println("\n===== SETTINGS =====");
                    System.out.println("1. Phone Settings");
                    System.out.println("2. Display Settings");
                    System.out.println("3. Call Settings");
                    System.out.println("4. Security Settings");
                    System.out.println("5. Restore Factory Settings");
                    System.out.println("6. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Phone settings selected.");
                            break;

                        case "2":
                            System.out.println("Display settings selected.");
                            break;

                        case "3":
                            System.out.println("Call settings selected.");
                            break;

                        case "4":
                            System.out.println("Security settings selected.");
                            break;

                        case "5":
                            System.out.println("Factory settings restored.");
                            break;

                        case "6":
                            break settingsMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CALL DIVERT
            case "7": {
                callDivertMenu:
                while (true) {

                    System.out.println("\n===== CALL DIVERT =====");
                    System.out.println("1. Divert All Voice Calls");
                    System.out.println("2. Divert When Busy");
                    System.out.println("3. Divert When Not Answered");
                    System.out.println("4. Divert When Unreachable");
                    System.out.println("5. Cancel All Diverts");
                    System.out.println("6. Check Divert Status");
                    System.out.println("7. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("All voice calls diverted.");
                            break;

                        case "2":
                            System.out.println("Calls will be diverted when busy.");
                            break;

                        case "3":
                            System.out.println("Calls will be diverted when not answered.");
                            break;

                        case "4":
                            System.out.println("Calls will be diverted when unreachable.");
                            break;

                        case "5":
                            System.out.println("All call diverts cancelled.");
                            break;

                        case "6":
                            System.out.println("Checking call divert status.");
                            break;

                        case "7":
                            break callDivertMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // MUSIC
            case "8": {
                musicMenu:
                while (true) {

                    System.out.println("\n===== MUSIC =====");
                    System.out.println("1. Music Player");
                    System.out.println("2. Radio");
                    System.out.println("3. Recorder");
                    System.out.println("4. Stop Music");
                    System.out.println("5. Track List");
                    System.out.println("6. Previous Track");
                    System.out.println("7. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Opening music player.");
                            break;

                        case "2":
                            System.out.println("Radio.");
                            break;

                        case "3":
                            System.out.println("Recorder.");
                            break;

                        case "4":
                            System.out.println("Music stopped.");
                            break;

                        case "5":
                            System.out.println("Opening track list.");
                            break;

                        case "6":
                            System.out.println("Playing previous track.");
                            break;

                        case "7":
                            break musicMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // GAMES
            case "9": {
                gamesMenu:
                while (true) {

                    System.out.println("\n===== GAMES =====");
                    System.out.println("1. Snake");
                    System.out.println("2. Space Impact");
                    System.out.println("3. Sudoku");
                    System.out.println("4. Select Game");
                    System.out.println("5. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Starting Snake game.");
                            break;

                        case "2":
                            System.out.println("Starting Space Impact.");
                            break;

                        case "3":
                            System.out.println("Starting Sudoku game.");
                            break;

                        case "4":
                            System.out.println("Choose your favourite game.");
                            break;

                        case "5":
                            break gamesMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CALCULATOR
            case "10": {
                calculatorMenu:
                while (true) {

                    System.out.println("\n===== CALCULATOR =====");
                    System.out.println("1. Addition (+)");
                    System.out.println("2. Subtraction (-)");
                    System.out.println("3. Multiplication (*)");
                    System.out.println("4. Division (/)");
                    System.out.println("5. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                           
                            
                           

                        switch (submenuChoice) {



 
                            case "1":
                            
                          
                         
                                break;

                            case "2":
                         
                            
                            

                              
                                break;

                            case "3":
                           
                            
                              
                                break;

                            case "4":
                            
                            
                      
                                
                       
                                
                                break;
                              case "5":
                              break calculatorMenu;
                      
                            default:
                        System.out.println("Invalid choice!");
                    }
                }
               break; 
            }

            // REMINDERS
            case "11": {
                remindersMenu:
                while (true) {

                    System.out.println("\n===== REMINDERS =====");
                    System.out.println("1. Add Reminder");
                    System.out.println("2. View Reminders");
                    System.out.println("3. Delete Reminder");
                    System.out.println("4. Delete All Reminders");
                    System.out.println("5. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.print("Enter your reminder: ");
                            String reminder = input.nextLine();

                            System.out.println("Reminder added: " + reminder);
                            break;

                        case "2":
                            System.out.println("Your reminders will appear here.");
                            break;

                        case "3":
                            System.out.println("Reminder deleted.");
                            break;

                        case "4":
                            System.out.println("All reminders deleted.");
                            break;

                        case "5":
                            break remindersMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CLOCK
            case "12": {
                clockMenu:
                while (true) {

                    System.out.println("\n===== CLOCK =====");
                    System.out.println("1. Show Time");
                    System.out.println("2. Show Date");
                    System.out.println("3. Stopwatch");
                    System.out.println("4. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Current Time: 05:40");
                            break;

                        case "2":
                            System.out.println("Current Date: Nov-14-2026");
                            break;

                        case "3":
                            System.out.println("Stopwatch feature coming soon.");
                            break;

                        case "4":
                            break clockMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // PROFILES
            case "13": {
                profilesMenu:
                while (true) {

                    System.out.println("\n===== PROFILES (ACTIVATION) =====");
                    System.out.println("1. General");
                    System.out.println("2. Silent");
                    System.out.println("3. Meeting");
                    System.out.println("4. Outdoor");
                    System.out.println("5. Pager");
                    System.out.println("6. Back");

                    System.out.print("Select profile: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("General profile activated.");
                            break;

                        case "2":
                            System.out.println("Silent profile activated.");
                            break;

                        case "3":
                            System.out.println("Meeting profile activated.");
                            break;

                        case "4":
                            System.out.println("Outdoor profile activated.");
                            break;

                        case "5":
                            System.out.println("Pager profile activated.");
                            break;

                        case "6":
                            break profilesMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // WAP SERVICES
            case "14": {
                wapMenu:
                while (true) {

                    System.out.println("\n===== WAP SERVICES =====");
                    System.out.println("1. Home");
                    System.out.println("2. Bookmarks");
                    System.out.println("3. Go to Address");
                    System.out.println("4. Service Inbox");
                    System.out.println("5. Saved Pages");
                    System.out.println("6. Settings");
                    System.out.println("7. Back");

                    System.out.print("Select option: ");
                    String submenuChoice = input.nextLine();

                    switch (submenuChoice) {

                        case "1":
                            System.out.println("Opening WAP homepage.");
                            break;

                        case "2":
                            System.out.println("Opening bookmarks.");
                            break;

                        case "3":
                            System.out.print("Enter website address: ");
                            String address = input.nextLine();

                            System.out.println("Website address: " + address);
                            break;

                        case "4":
                            System.out.println("Opening service inbox.");
                            break;

                        case "5":
                            System.out.println("Opening saved pages.");
                            break;

                        case "6":
                            System.out.println("Opening WAP settings.");
                            break;

                        case "7":
                            break wapMenu;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                break;
            }

            // CALL
            case "15":
                System.out.println("Calling...");
                break;

            // EXIT
            case "16":
                System.out.println("Thank you for using Nokia!");
                input.close();
                return;

            default:
                System.out.println("Invalid selection. Try again.");
        }
    }
}

}
