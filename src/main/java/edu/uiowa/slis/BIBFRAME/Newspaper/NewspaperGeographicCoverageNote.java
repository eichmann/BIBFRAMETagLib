package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperGeographicCoverageNoteIterator theNewspaper = (NewspaperGeographicCoverageNoteIterator)findAncestorWithClass(this, NewspaperGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theNewspaper.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

