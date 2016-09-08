package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileExtent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileExtent currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileExtent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileExtentIterator theTactile = (TactileExtentIterator)findAncestorWithClass(this, TactileExtentIterator.class);
			pageContext.getOut().print(theTactile.getExtent());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for extent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for extent tag ");
		}
		return SKIP_BODY;
	}
}

