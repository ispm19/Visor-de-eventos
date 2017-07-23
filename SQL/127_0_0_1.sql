-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-07-2017 a las 17:34:10
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `centralita`
--
CREATE DATABASE IF NOT EXISTS `centralita` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `centralita`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `llamadas`
--

CREATE TABLE `llamadas` (
  `Origen` int(11) NOT NULL,
  `Destino` int(11) NOT NULL,
  `Duracion` double NOT NULL,
  `Precio` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `llamadas`
--

INSERT INTO `llamadas` (`Origen`, `Destino`, `Duracion`, `Precio`) VALUES
(1231312, 1323, 2, 0.3),
(2, 321, 1, 0.15),
(13, 1231, 12312, 1846.8),
(12311111, 333, 12, 3.5999999999999996),
(123, 1231, 5, 0.75);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `USER` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`USER`, `PASSWORD`) VALUES
('admin', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `llamadas`
--
ALTER TABLE `llamadas`
  ADD PRIMARY KEY (`Origen`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`USER`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `llamadas`
--
ALTER TABLE `llamadas`
  MODIFY `Origen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123131235;--
-- Base de datos: `trabajofinal`
--
CREATE DATABASE IF NOT EXISTS `trabajofinal` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `trabajofinal`;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
