package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileSupplementaryContentNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileSupplementaryContentNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileSupplementaryContentNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileSupplementaryContentNoteIterator theTactile = (TactileSupplementaryContentNoteIterator)findAncestorWithClass(this, TactileSupplementaryContentNoteIterator.class);
			pageContext.getOut().print(theTactile.getSupplementaryContentNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for supplementaryContentNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for supplementaryContentNote tag ");
		}
		return SKIP_BODY;
	}
}

