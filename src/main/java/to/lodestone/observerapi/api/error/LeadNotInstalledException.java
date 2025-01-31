package to.lodestone.observerapi.api.error;

public class LeadNotInstalledException extends Exception {
    public LeadNotInstalledException() {
        super("Lead isn't installed on this server.");
    }
}
