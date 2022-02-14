import "./WhatsHappening.css";
import "./HappeningContent";
import HappeningContent from "./HappeningContent";

function WhatsHappening(props) {
  return (
    <div className="whatsHappening">
      <h1 className="happeningTitle">What's Happening?</h1>
      <HappeningContent />
      <HappeningContent />
      <HappeningContent />
      <HappeningContent />
      <a className="showMore">Show more</a>
    </div>
  );
}
export default WhatsHappening;
