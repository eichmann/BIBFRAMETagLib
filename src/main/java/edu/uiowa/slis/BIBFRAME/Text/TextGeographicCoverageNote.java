package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TextGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextGeographicCoverageNoteIterator theText = (TextGeographicCoverageNoteIterator)findAncestorWithClass(this, TextGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theText.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

