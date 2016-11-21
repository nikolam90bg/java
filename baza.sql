-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2016 at 03:05 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `baza`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosije`
--

DROP TABLE IF EXISTS `dosije`;
CREATE TABLE IF NOT EXISTS `dosije` (
  `korisnicko_ime` varchar(35) NOT NULL,
  `lozinka` varchar(35) NOT NULL,
  `slika` varchar(120) NOT NULL,
  `ime` varchar(35) NOT NULL,
  `prezime` varchar(35) NOT NULL,
  `adresa` varchar(50) NOT NULL,
  `telefon` varchar(35) NOT NULL,
  `mail` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosije`
--

INSERT INTO `dosije` (`korisnicko_ime`, `lozinka`, `slika`, `ime`, `prezime`, `adresa`, `telefon`, `mail`) VALUES
('admin', 'admin', 'images/profil/01.jpg', 'Nikola', 'Maravic', 'Milentija Popovica 21/21', '063/123-1111', 'nikola@mail.com'),
('ana', '111', 'images/profil/03.jpg', 'Ana', 'Anicic', 'Kneza Milosa 3', '069/122-34-55', 'ana.anicic@mail.com'),
('pera', '123', 'images/profil/04.jpg', 'Pera', 'Petrovic', 'Nade Dimic 3', '069/555-54-31', 'pera@mail.rs'),
('stefi', 'stefi', 'images/profil/profil2.png', 'Stefan', 'Nikolic', 'Balkanska 21c', '062/001-33-44', 'stefan@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `hamburger`
--

DROP TABLE IF EXISTS `hamburger`;
CREATE TABLE IF NOT EXISTS `hamburger` (
  `sifra` varchar(35) NOT NULL,
  `naziv` varchar(35) NOT NULL,
  `slika` varchar(50) NOT NULL,
  `opis` varchar(120) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hamburger`
--

INSERT INTO `hamburger` (`sifra`, `naziv`, `slika`, `opis`, `cena`) VALUES
('h01', 'ORIGINAL', 'images/burger/b01.png', 'govedje meso, salata,sos, kecap, kackavalj', 280),
('h02', 'CLASSIC', 'images/burger/b02.png', 'govedje meso, krastavac, luk, kecap', 200),
('h03', 'CHEESZBURGER', 'images/burger/b04.png', 'govedje meso, krastavac, luk, kecap, kackavalj', 250),
('h04', 'BACON', 'images/burger/b03.png', 'govedje meso, sos, luk, kackavalj, slanina', 300);

-- --------------------------------------------------------

--
-- Table structure for table `korpa`
--

DROP TABLE IF EXISTS `korpa`;
CREATE TABLE IF NOT EXISTS `korpa` (
  `sifra` varchar(35) NOT NULL,
  `naziv` varchar(35) NOT NULL,
  `slika` varchar(50) NOT NULL,
  `opis` varchar(120) NOT NULL,
  `kolicina` int(11) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `narudzbenica`
--

DROP TABLE IF EXISTS `narudzbenica`;
CREATE TABLE IF NOT EXISTS `narudzbenica` (
  `id` int(11) NOT NULL,
  `korisnicko_ime` varchar(35) NOT NULL,
  `ime_prezime` varchar(70) NOT NULL,
  `adresa` varchar(70) NOT NULL,
  `datum` varchar(12) NOT NULL,
  `vreme` varchar(12) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `narudzbenica`
--

INSERT INTO `narudzbenica` (`id`, `korisnicko_ime`, `ime_prezime`, `adresa`, `datum`, `vreme`, `cena`) VALUES
(19, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '02:29', 4201.18),
(20, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '02:29', 601.18),
(21, 'stefi', 'Stefan Nikolic', 'Balkanska 21c', '20.02.2016.', '02:30', 840),
(22, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '01:08', 1500.59),
(23, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '01:46', 1801.18),
(24, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '02:12', 6640),
(25, 'pera', 'Pera Petrovic', 'Nade Dimic 3', '20.02.2016.', '02:29', 2900);

-- --------------------------------------------------------

--
-- Table structure for table `pasta`
--

DROP TABLE IF EXISTS `pasta`;
CREATE TABLE IF NOT EXISTS `pasta` (
  `sifra` varchar(35) NOT NULL,
  `naziv` varchar(35) NOT NULL,
  `slika` varchar(50) NOT NULL,
  `opis` varchar(120) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasta`
--

INSERT INTO `pasta` (`sifra`, `naziv`, `slika`, `opis`, `cena`) VALUES
('01', 'NAPOLETANA', 'images/pasta/02.png', 'kackavalj, mleveno meso, bareno povrce', 300.59),
('02', 'AGLIO E OLIO', 'images/pasta/03.png', 'piletine, pavlaka, maslac,parmezan', 1200),
('03', 'PROSCIUTTO', 'images/pasta/01.png', 'beli luk, crni luk, paradajz pelat, maslinovo ulje', 470);

-- --------------------------------------------------------

--
-- Table structure for table `pica`
--

DROP TABLE IF EXISTS `pica`;
CREATE TABLE IF NOT EXISTS `pica` (
  `sifra` varchar(35) NOT NULL,
  `naziv` varchar(35) NOT NULL,
  `slika` varchar(50) NOT NULL,
  `opis` varchar(120) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pica`
--

INSERT INTO `pica` (`sifra`, `naziv`, `slika`, `opis`, `cena`) VALUES
('p01', 'CAPRICCIOSA', 'images/pica/p01.png', 'Sunka, pecurke, sir i pelat', 950),
('p02', 'PEPERONI', 'images/pica/p03.png', 'Kulen, sir i pelat', 760),
('p03', 'VEGETARIANA', 'images/pica/p02.png', 'Pecurke, kukuruz,\r\npaprika, luk, crne masline,\r\nsir i pelat', 690),
('p04', 'TUNA', 'images/pica/p04.png', 'Tunjevina, pecurke,\r\ncrne masline i pelat', 770),
('p05', 'MARGHERITA', 'images/pica/p05.png', 'Sir i pelat', 610);

-- --------------------------------------------------------

--
-- Table structure for table `poruka`
--

DROP TABLE IF EXISTS `poruka`;
CREATE TABLE IF NOT EXISTS `poruka` (
  `id` int(11) NOT NULL,
  `ime_prezime` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `telefon` varchar(45) NOT NULL,
  `sadrzaj` varchar(250) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `poruka`
--

INSERT INTO `poruka` (`id`, `ime_prezime`, `mail`, `telefon`, `sadrzaj`) VALUES
(2, 'Petar Petrovic', 'pera@mail.rs', '011/123-546', 'Najbolji ste u gradu!');

-- --------------------------------------------------------

--
-- Table structure for table `sendvic`
--

DROP TABLE IF EXISTS `sendvic`;
CREATE TABLE IF NOT EXISTS `sendvic` (
  `sifra` varchar(35) NOT NULL,
  `naziv` varchar(35) NOT NULL,
  `slika` varchar(50) NOT NULL,
  `opis` varchar(120) NOT NULL,
  `cena` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sendvic`
--

INSERT INTO `sendvic` (`sifra`, `naziv`, `slika`, `opis`, `cena`) VALUES
('s01', 'CLUB SENDVIC', 'images/sendvic/s01.png', 'Sunka, zelena salata, pavljaka, kecap, majonez', 200),
('s02', 'PILECI', 'images/sendvic/s04.png', 'Pileca sunka, paradajz, pavlaka, majonez, senf', 230);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosije`
--
ALTER TABLE `dosije`
  ADD PRIMARY KEY (`korisnicko_ime`);

--
-- Indexes for table `hamburger`
--
ALTER TABLE `hamburger`
  ADD PRIMARY KEY (`sifra`);

--
-- Indexes for table `korpa`
--
ALTER TABLE `korpa`
  ADD PRIMARY KEY (`sifra`);

--
-- Indexes for table `narudzbenica`
--
ALTER TABLE `narudzbenica`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pasta`
--
ALTER TABLE `pasta`
  ADD PRIMARY KEY (`sifra`);

--
-- Indexes for table `pica`
--
ALTER TABLE `pica`
  ADD PRIMARY KEY (`sifra`);

--
-- Indexes for table `poruka`
--
ALTER TABLE `poruka`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sendvic`
--
ALTER TABLE `sendvic`
  ADD PRIMARY KEY (`sifra`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `narudzbenica`
--
ALTER TABLE `narudzbenica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
--
-- AUTO_INCREMENT for table `poruka`
--
ALTER TABLE `poruka`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
