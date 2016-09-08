package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileCopyrightDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileCopyrightDate currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileCopyrightDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileCopyrightDateIterator theTactile = (TactileCopyrightDateIterator)findAncestorWithClass(this, TactileCopyrightDateIterator.class);
			pageContext.getOut().print(theTactile.getCopyrightDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for copyrightDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for copyrightDate tag ");
		}
		return SKIP_BODY;
	}
}

