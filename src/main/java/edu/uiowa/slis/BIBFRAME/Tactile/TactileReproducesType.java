package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileReproducesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileReproducesIterator theTactileReproducesIterator = (TactileReproducesIterator)findAncestorWithClass(this, TactileReproducesIterator.class);
			pageContext.getOut().print(theTactileReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

