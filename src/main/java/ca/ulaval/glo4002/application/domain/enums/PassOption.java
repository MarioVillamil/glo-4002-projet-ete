package ca.ulaval.glo4002.application.domain.enums;

public enum PassOption {
  FORFAIT("forfait"),
  PASSE_JOURNALIERE("passe_journaliere");
  private final String passOption;

  PassOption(String passOption) {
    this.passOption = passOption;
  }
}
