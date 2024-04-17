import { FC, useState } from "react";

export interface SearchProp {
  search: (e: string) => void;
}
const Search: FC<SearchProp> = ({ search }) => {
  const [searchText, setSearchText] = useState<string>("");

  function onChange(tag: string) {
    setSearchText(tag);
    search(tag);
  }

  return (
    <section className="search">
      <input
        type="text"
        placeholder="Search DevProblems Youtube Video"
        value={searchText}
        onChange={(e) => onChange(e.target.value)}
        autoFocus
      />
    </section>
  );
};

export default Search;
