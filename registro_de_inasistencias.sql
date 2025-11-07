-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2025 a las 04:13:01
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro_de_inasistencias`
--

create database registro_de_inasistencias;

use registro_de_inasistencias;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adscripto`
--

CREATE TABLE `adscripto` (
  `contrasenia` varchar(18) NOT NULL,
  `cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `adscripto`
--

INSERT INTO `adscripto` (`contrasenia`, `cedula`) VALUES
('67', 59278153);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inasistencia_docente`
--

CREATE TABLE `inasistencia_docente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `turno` varchar(36) NOT NULL,
  `fecha_finalizacion` date NOT NULL,
  `fecha_inicio` date NOT NULL,
  `cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inasistencia_docente`
--

INSERT INTO `inasistencia_docente` (`id`, `nombre`, `apellido`, `turno`, `fecha_finalizacion`, `fecha_inicio`, `cedula`) VALUES
(17, 'Marcela', 'Mederos', 'Matutino', '2025-12-12', '2025-12-11', 46191437);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cedula`) VALUES
(59278153);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `adscripto`
--
ALTER TABLE `adscripto`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `inasistencia_docente`
--
ALTER TABLE `inasistencia_docente`
  ADD PRIMARY KEY (`id`,`cedula`),
  ADD KEY `cedula` (`cedula`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `inasistencia_docente`
--
ALTER TABLE `inasistencia_docente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
