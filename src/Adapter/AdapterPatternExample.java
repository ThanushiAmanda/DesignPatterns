package Adapter;

    // TwoPinPlug
    interface TwoPinPlug {
        void connect();
    }

    class OldTwoPinPlug implements TwoPinPlug {
        public void connect() {
            System.out.println("Two-pin plug connected to power source.");
        }
    }

    // ThreePinSocket
    interface ThreePinSocket {
        void plugIn();
    }

    class NewThreePinSocket implements ThreePinSocket {
        public void plugIn() {
            System.out.println("Three-pin socket connected to power source.");
        }
    }

    // PlugAdapter
    class PlugAdapter implements ThreePinSocket {
        private TwoPinPlug twoPinPlug;

        public PlugAdapter(TwoPinPlug twoPinPlug) {
            this.twoPinPlug = twoPinPlug;
        }

        public void plugIn() {
            twoPinPlug.connect();
        }
    }

    // Main method
    public class AdapterPatternExample {
        public static void main(String[] args) {
            // Old two-pin plug
            TwoPinPlug oldPlug = new OldTwoPinPlug();

            // Adapter to connect old plug to new socket
            ThreePinSocket adapter = new PlugAdapter(oldPlug);

            // Using the adapter to connect the old plug to the new socket
            adapter.plugIn();
        }
    }


