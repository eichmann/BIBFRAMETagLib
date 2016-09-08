package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIsInstanceOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIsInstanceOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIsInstanceOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileIsInstanceOfIterator theTactileIsInstanceOfIterator = (TactileIsInstanceOfIterator)findAncestorWithClass(this, TactileIsInstanceOfIterator.class);
			pageContext.getOut().print(theTactileIsInstanceOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for isInstanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for isInstanceOf tag ");
		}
		return SKIP_BODY;
	}
}

