# Cashy App - Expense Tracker
<div align="center">
  <a href="https://github.com/Mazen-73/cashy/releases/latest">
    <img src="https://img.shields.io/badge/Download-Latest_APK-blue?style=for-the-badge&logo=android" alt="Download APK">
  </a>
</div>
This app is **Cashy**, an expense tracker built with **Material Design 3 (M3)**, featuring an expressive user interface with spring animations.

## 📱 Key Technical Features
* **UI/UX:** Uses Material Design 3 components, supports both Light and Dark modes, custom fonts, and an expressive Bottom Navigation bar.
* **Data Management:**
    * Balances and transactions are persistently stored using `SharedPreferences`.
    * Transactions are saved as a JSON array string.
    * Supports background operations using `CoroutineScope` to ensure smooth performance.
* **Interactions (Animations):**
    * Uses `AnimatorSet` and `ObjectAnimator` with `OvershootInterpolator` for lively, interactive feedback when pressing buttons.

## 🧩 App Structure
The `MainActivity` is divided into three main screens switched within a `CoordinatorLayout`:
1.  **Home Screen:**
    * Features a balance display and a note-taking field.
    * Custom Numpad for quick input.
    * Synchronized "Spent" and "Received" buttons.
    * "Recent" section displaying the last 4 transactions.
2.  **History Screen:**
    * Displays the full transaction history, sorted and grouped by date.
3.  **Settings Screen:**
    * Integrated directly into the main screen, supporting: name editing, language switching (Arabic/English), theme selection, email feedback (with auto-attached device info), and app sharing.

## 🛠 Tools & Libraries
* **Language:** Kotlin.
* **Libraries:** `androidx.appcompat`, `material`, `kotlinx.coroutines`, `FileProvider`.
* **Compatibility:** Uses `AppCompatDelegate` for dynamic language and dark mode management.
