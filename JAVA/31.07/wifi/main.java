interface wifi {
    void connect(String net);
    void disconnect();
}

interface bt {
    void pair(String dev);
    void unpair();
}

class speaker implements wifi, bt {
    public void connect(String net) {
        System.out.println("Connecting to WiFi: " + net);
    }

    public void disconnect() {
        System.out.println("Disconnecting WiFi.");
    }

    public void pair(String dev) {
        System.out.println("Pairing BT device: " + dev);
    }

    public void unpair() {
        System.out.println("Unpairing BT device.");
    }
}

class main {
    public static void main(String[] args) {
        speaker s = new speaker();

        s.connect("HomeWiFi");
        s.disconnect();

        s.pair("Headset");
        s.unpair();
    }
}
