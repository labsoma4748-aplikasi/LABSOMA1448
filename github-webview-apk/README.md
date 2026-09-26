# Membuat APK dari GitHub Actions

Proyek ini membuat aplikasi Android sederhana yang membuka URL web Anda. APK debug akan tersedia untuk diunduh sebagai GitHub Actions artifact; tidak perlu Play Store.

## 1. Unggah proyek ke GitHub

Buat repositori GitHub baru, lalu unggah seluruh isi folder ini (termasuk folder tersembunyi `.github`). Pastikan file workflow berada di `.github/workflows/build-apk.yml` pada akar repositori.

URL Google Apps Script Anda sudah dimasukkan ke proyek. Jika nanti URL berubah, edit nilai `appUrl` di `app/build.gradle.kts`.

## 2. Jalankan build

Buka tab **Actions → Build Android APK → Run workflow**. Tunggu sampai proses selesai dengan tanda hijau.

## 3. Unduh dan pasang

Buka hasil workflow yang selesai, cari bagian **Artifacts**, lalu unduh `aplikasi-android-debug`. Ekstrak ZIP di HP dan ketuk `app-debug.apk`. Jika diminta, izinkan pemasangan aplikasi dari sumber tersebut.

APK ini memerlukan internet untuk membuka situs. Build ini ditujukan untuk instalasi pribadi (debug APK), bukan Play Store. Agar GitHub dapat menjalankan workflow, repositori harus mengaktifkan GitHub Actions.
