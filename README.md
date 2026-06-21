<p align="center">
  <img src="images/icon.png" width="128" height="128">
</p>

<h1 align="center">Cashy - A Material 3 Expressive Digital Money Tracker</h1>

<p align="center">
  <img src="images/banner.png" alt="Feature Graphic" width="100%">
</p>
<p align="center">
  <img src="https://ziadoua.github.io/m3-Markdown-Badges/badges/Android/android2.svg">&nbsp;&nbsp;
  <img src="https://ziadoua.github.io/m3-Markdown-Badges/badges/AndroidStudio/androidstudio2.svg">&nbsp;&nbsp;
  <img src="https://ziadoua.github.io/m3-Markdown-Badges/badges/Kotlin/kotlin2.svg">&nbsp;&nbsp;
    <a href="https://github.com/Mazen-73/Cashy/stargazers">
    <img src="https://m3-markdown-badges.vercel.app/stars/4/1/Mazen-73/Cashy" alt="GitHub Stars">
  </a>
</p>

<strong>Cashy</strong>, an expense tracker built with <strong>Material Design 3 Expressive</strong>, featuring an expressive user interface with spring animations.

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
---

## ⭐ Support the Project
If you find **Cashy** helpful or like the design, please consider giving it a star! It helps the project grow and motivates me to add more features.

<p align="center">
  <a href="https://github.com/Mazen-73/Cashy/stargazers">
    <img src="https://m3-markdown-badges.vercel.app/stars/4/1/Mazen-73/Cashy" alt="GitHub Stars">
  </a>
</p>

---
## 🛠 Tools & Libraries
* **Language:** Kotlin.
* **Libraries:** `androidx.appcompat`, `material`, `kotlinx.coroutines`, `FileProvider`.
* **Compatibility:** Uses `AppCompatDelegate` for dynamic language and dark mode management.
<p align="center">  
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="https://i.postimg.cc/KzPKjBNn/footer-Dark.png">
    <source media="(prefers-color-scheme: light)" srcset="https://i.postimg.cc/C5wRq5P9/footer-Light.png">
    <img alt="Footer" src="https://i.postimg.cc/KzPKjBNn/footer-Dark.png">
  </picture>
</p>
