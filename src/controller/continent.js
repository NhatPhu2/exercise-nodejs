const fs = require("fs");
const fetchAllContinent = (req, res) => {
  fs.readFile("src/fakedata/output.json", (error, data) => {
    if (error) res.sendStatus(404);
    res.send(JSON.parse(data));
  });
};

const fetchContinentByCountry = (req, res) => {
  const { country } = req.params;
  fs.readFile("src/fakedata/output.json", (error, data) => {
    if (error) res.status(404).json("File not found");
    let contientObj = JSON.parse(data);
    contientObj.children = contientObj.children.map((firstChildren) => {
      let childrenYear = firstChildren;
      childrenYear.children = firstChildren.children.map((childrenType) => {
        let typeChildren = childrenType;

        typeChildren.children = childrenType.children.map(
          (childrenWithContinent, index) => {
            let childrenContinent = childrenWithContinent;
            //return new country for continent
            childrenContinent.children = childrenWithContinent.children.filter(
              (childrenCountry) => {
                //return country has been filtered by keyword
                return childrenCountry.country
                  .toLowerCase()
                  .startsWith(country);
              }
            );
            //return contient of country
            return childrenContinent;
          }
        );
        //remove continent have no country
        typeChildren.children = typeChildren.children.filter(
          (e) => e.children.length > 0
        );
        //return type of children
        return typeChildren;
      });
      //root return children
      return childrenYear;
    });
    res.send(contientObj);
  });
};

module.exports = {
  fetchAllContinent,
  fetchContinentByCountry,
};
