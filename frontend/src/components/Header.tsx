import { FC } from "react";

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
const Header: FC<{}> = () => {
  return (
    <header className="center">
      <img src={require("../assets/logo.png")} alt="logo" />
    </header>
  );
};

export default Header;
