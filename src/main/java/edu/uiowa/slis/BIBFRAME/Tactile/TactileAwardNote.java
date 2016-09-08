package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileAwardNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileAwardNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileAwardNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileAwardNoteIterator theTactile = (TactileAwardNoteIterator)findAncestorWithClass(this, TactileAwardNoteIterator.class);
			pageContext.getOut().print(theTactile.getAwardNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for awardNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for awardNote tag ");
		}
		return SKIP_BODY;
	}
}

