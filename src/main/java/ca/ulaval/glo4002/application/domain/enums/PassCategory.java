package ca.ulaval.glo4002.application.domain.enums;

public enum PassCategory {
  VIP("VIP"),
  PREMIUM("Premium"),
  STANDARD("Standard");
  private final String passCategoryName;

  PassCategory(String passCategoryName) {
    this.passCategoryName = passCategoryName;
  }
}
