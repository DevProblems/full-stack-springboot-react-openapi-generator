import { FC } from "react";

const Header: FC<{}> = () => {
  return (
    <header className="center">
      <img src={require("../assets/logo.png")} alt="logo" />
    </header>
  );
};

export default Header;
