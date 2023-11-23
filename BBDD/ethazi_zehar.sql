-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2023 a las 09:50:09
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ethazi_zehar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adierazleak`
--

CREATE TABLE `adierazleak` (
  `id` int(11) NOT NULL,
  `izena` varchar(256) NOT NULL,
  `deskribapena` varchar(256) DEFAULT NULL,
  `konpetentzia_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ebidentzia`
--

CREATE TABLE `ebidentzia` (
  `id` int(11) NOT NULL,
  `irakasle_id` int(11) NOT NULL,
  `proiektu_id` int(11) NOT NULL,
  `adierazle_id` int(11) NOT NULL,
  `ikasle_id` int(11) NOT NULL,
  `data` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ikasleak`
--

CREATE TABLE `ikasleak` (
  `id` int(11) NOT NULL,
  `izena` varchar(255) NOT NULL,
  `abizenak` varchar(255) NOT NULL,
  `taldea` varchar(255) NOT NULL,
  `aktibo_dago` tinyint(4) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `irakasleak`
--

CREATE TABLE `irakasleak` (
  `id` int(11) NOT NULL,
  `izena` varchar(255) NOT NULL,
  `abizenak` varchar(255) NOT NULL,
  `erabiltzailea` varchar(255) NOT NULL,
  `pasahitza` varchar(255) NOT NULL,
  `admin_da` tinyint(4) NOT NULL DEFAULT 0,
  `aktibo_dago` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jarraitu`
--

CREATE TABLE `jarraitu` (
  `irakasle_id` int(11) NOT NULL,
  `proiektu_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `konpetentziak`
--

CREATE TABLE `konpetentziak` (
  `id` int(11) NOT NULL,
  `izena` varchar(255) NOT NULL,
  `deskribapena` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proiektuak`
--

CREATE TABLE `proiektuak` (
  `id` int(11) NOT NULL,
  `izena` varchar(255) NOT NULL,
  `ebaluazioa` varchar(255) DEFAULT NULL,
  `ikasturtea` varchar(255) NOT NULL,
  `moduluak` varchar(512) DEFAULT NULL,
  `aktibo_dago` tinyint(4) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `adierazleak`
--
ALTER TABLE `adierazleak`
  ADD PRIMARY KEY (`id`),
  ADD KEY `konpetentzia_id` (`konpetentzia_id`);

--
-- Indices de la tabla `ebidentzia`
--
ALTER TABLE `ebidentzia`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `irakasle_id_2` (`irakasle_id`,`proiektu_id`,`adierazle_id`,`ikasle_id`,`data`),
  ADD KEY `irakasle_id` (`irakasle_id`),
  ADD KEY `proiektu_id` (`proiektu_id`),
  ADD KEY `adierazle_id` (`adierazle_id`),
  ADD KEY `ikasle_id` (`ikasle_id`);

--
-- Indices de la tabla `ikasleak`
--
ALTER TABLE `ikasleak`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `irakasleak`
--
ALTER TABLE `irakasleak`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`erabiltzailea`);

--
-- Indices de la tabla `jarraitu`
--
ALTER TABLE `jarraitu`
  ADD KEY `irakasle_id` (`irakasle_id`),
  ADD KEY `proiektu_id` (`proiektu_id`);

--
-- Indices de la tabla `konpetentziak`
--
ALTER TABLE `konpetentziak`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proiektuak`
--
ALTER TABLE `proiektuak`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `adierazleak`
--
ALTER TABLE `adierazleak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ebidentzia`
--
ALTER TABLE `ebidentzia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ikasleak`
--
ALTER TABLE `ikasleak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `irakasleak`
--
ALTER TABLE `irakasleak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `konpetentziak`
--
ALTER TABLE `konpetentziak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `proiektuak`
--
ALTER TABLE `proiektuak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `adierazleak`
--
ALTER TABLE `adierazleak`
  ADD CONSTRAINT `adierazleak_ibfk_1` FOREIGN KEY (`konpetentzia_id`) REFERENCES `konpetentziak` (`id`);

--
-- Filtros para la tabla `ebidentzia`
--
ALTER TABLE `ebidentzia`
  ADD CONSTRAINT `ebidentzia_ibfk_1` FOREIGN KEY (`irakasle_id`) REFERENCES `ikasleak` (`id`),
  ADD CONSTRAINT `ebidentzia_ibfk_2` FOREIGN KEY (`adierazle_id`) REFERENCES `adierazleak` (`id`),
  ADD CONSTRAINT `ebidentzia_ibfk_3` FOREIGN KEY (`proiektu_id`) REFERENCES `proiektuak` (`id`),
  ADD CONSTRAINT `ebidentzia_ibfk_4` FOREIGN KEY (`ikasle_id`) REFERENCES `ikasleak` (`id`);

--
-- Filtros para la tabla `jarraitu`
--
ALTER TABLE `jarraitu`
  ADD CONSTRAINT `jarraitu_ibfk_1` FOREIGN KEY (`irakasle_id`) REFERENCES `irakasleak` (`id`),
  ADD CONSTRAINT `jarraitu_ibfk_2` FOREIGN KEY (`proiektu_id`) REFERENCES `proiektuak` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
