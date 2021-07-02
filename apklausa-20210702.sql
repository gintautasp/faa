-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2021 at 08:56 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fizinis_aktyvumas`
--

-- --------------------------------------------------------

--
-- Table structure for table `apklausa`
--

CREATE TABLE `apklausa` (
  `id` int(10) UNSIGNED NOT NULL,
  `lytis` enum('V','M') COLLATE utf8_lithuanian_ci NOT NULL,
  `amzius_periodo_pabaigoje` int(10) UNSIGNED NOT NULL,
  `kritines_ligos_pries` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `chroniski_negalavimai_pries` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `nubegamas_atstumas_per_12min_pries` decimal(5,2) UNSIGNED NOT NULL,
  `prisitraukimai_pries` int(10) UNSIGNED NOT NULL,
  `periodas_men` int(10) UNSIGNED NOT NULL,
  `pagr_veikla` varchar(128) COLLATE utf8_lithuanian_ci NOT NULL,
  `neintensyvios_veiklos_rusys` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `val_per_sav_neintensyviai` decimal(5,2) UNSIGNED NOT NULL,
  `kartai_per_sav_neintensyviai` int(10) UNSIGNED NOT NULL,
  `intensyvios_veiklos_rusys` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `val_per_sav_intensyviai` decimal(5,2) UNSIGNED NOT NULL,
  `kartai_per_sav_intensyviai` int(10) UNSIGNED NOT NULL,
  `pastabos` text COLLATE utf8_lithuanian_ci NOT NULL,
  `kritines_ligos_po` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `chroniski_negalavimai_po` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `nubegamas_atstumas_per_12min_po` decimal(5,2) UNSIGNED NOT NULL,
  `prisitraukimai_po` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apklausa`
--
ALTER TABLE `apklausa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apklausa`
--
ALTER TABLE `apklausa`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
