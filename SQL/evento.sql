-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2017 a las 15:23:17
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `trabajofinal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `IDEVENTO` int(11) NOT NULL,
  `DESCRIPCION` varchar(30) NOT NULL,
  `UBICACIÓN` varchar(30) NOT NULL,
  `TIPO` varchar(30) NOT NULL,
  `FECHA` date NOT NULL,
  `ESTADO` bit(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`IDEVENTO`, `DESCRIPCION`, `UBICACIÓN`, `TIPO`, `FECHA`, `ESTADO`) VALUES
(2, 'hdhhd', 'jjdjd', 'hhdd', '2017-07-27', b'01'),
(5, 'asdasd', '', '', '2017-07-27', b'00'),
(6, 'sadasd', 'asda', 'asd', '2017-07-27', b'01'),
(7, 'asd', 'asda', 'asd', '2017-07-27', b'01'),
(8, 'asdasd', 'asd', 'asda', '2017-07-27', b'01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`IDEVENTO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
  MODIFY `IDEVENTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
