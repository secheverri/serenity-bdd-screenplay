# language: es

Característica: Consultar hotel inntu en booking
Dado que quiero descansar en un hotel
Como viajero casual
Quiero poder consultar disponibilidad del hotel por internet


  Escenario: Santiago quiere reservar un hotel en Medellin
  Santiago prefiere escoger si reserva una habitacion doble o no.
  No está seguro cuando quiere reservar el hotel, así que prefiere consultar el mes más economico.

    Dado que Santiago ha decidido consultar la disponibilidad de hoteles
    Cuando el mira el hotel inntu desde hoy hasta mañana
    Entonces el deberia elegir entre las siguientes opciones de habitaciones:
      | Individual |
      | Doble      |
