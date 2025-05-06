package gg.lode.observerapi.api.exception;

public class LeadNotInstalledException extends Exception {
    public LeadNotInstalledException() {
        super("Lead isn't installed on this server.");
    }
}
