-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2017 a las 00:40:41
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
  `ESTADO` bit(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`IDEVENTO`, `DESCRIPCION`, `UBICACIÓN`, `TIPO`, `FECHA`, `ESTADO`) VALUES
(34, 'aaaaaaaaaa', 'aaaaa', 'aaaaaaaaa', '2017-08-09', b'1111111111111111111111111111111');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invitacion`
--

CREATE TABLE `invitacion` (
  `IDINVITACION` int(11) NOT NULL,
  `IDEVENTO` int(10) NOT NULL,
  `IDINVITADO` int(10) NOT NULL,
  `LLEGO` bit(2) NOT NULL,
  `ESTADO` bit(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invitado`
--

CREATE TABLE `invitado` (
  `IDINVITADO` int(11) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `SEXO` varchar(30) NOT NULL,
  `EMAIL` varchar(30) NOT NULL,
  `FECHA` date NOT NULL,
  `DIRECCION` varchar(30) NOT NULL,
  `TELEFONO` varchar(30) NOT NULL,
  `ESTADO` bit(2) NOT NULL,
  `APELLIDO` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(30) NOT NULL,
  `NombreUsuario` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `NombreCompleto` varchar(30) NOT NULL,
  `TipoUsuario` varchar(30) NOT NULL,
  `Estado` bit(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `NombreUsuario`, `Password`, `NombreCompleto`, `TipoUsuario`, `Estado`) VALUES
(2, 'asdasd', 'asd', 'asd', 'Portero', b'1111111111111111111111111111111'),
(3, 'warlyn', 'asd', 'warlyn g', 'Administrador', b'1111111111111111111111111111111'),
(4, 'warlyn', 'qwe', 'a', 'Portero', b'1111111111111111111111111111111'),
(5, 'admin', 'admin', 'adminis', 'Administrador', b'1111111111111111111111111111111'),
(6, 'port', 'port', 'portero', 'Portero', b'1111111111111111111111111111111');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`IDEVENTO`);

--
-- Indices de la tabla `invitacion`
--
ALTER TABLE `invitacion`
  ADD PRIMARY KEY (`IDINVITACION`);

--
-- Indices de la tabla `invitado`
--
ALTER TABLE `invitado`
  ADD PRIMARY KEY (`IDINVITADO`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
  MODIFY `IDEVENTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT de la tabla `invitacion`
--
ALTER TABLE `invitacion`
  MODIFY `IDINVITACION` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `invitado`
--
ALTER TABLE `invitado`
  MODIFY `IDINVITADO` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
