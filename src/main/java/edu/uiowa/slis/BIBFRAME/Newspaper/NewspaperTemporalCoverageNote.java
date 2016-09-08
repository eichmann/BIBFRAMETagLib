package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperTemporalCoverageNoteIterator theNewspaper = (NewspaperTemporalCoverageNoteIterator)findAncestorWithClass(this, NewspaperTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theNewspaper.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

