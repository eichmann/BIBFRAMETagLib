package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileGraphicScaleNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileGraphicScaleNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileGraphicScaleNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileGraphicScaleNoteIterator theTactile = (TactileGraphicScaleNoteIterator)findAncestorWithClass(this, TactileGraphicScaleNoteIterator.class);
			pageContext.getOut().print(theTactile.getGraphicScaleNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for graphicScaleNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for graphicScaleNote tag ");
		}
		return SKIP_BODY;
	}
}

