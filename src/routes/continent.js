const express = require("express");
const router = express.Router();
const continentController = require("../controller/continent");

router.get("/continents", continentController.fetchAllContinent);
router.get("/continents/country",continentController.fetchContinentByCountry)
module.exports = router;
