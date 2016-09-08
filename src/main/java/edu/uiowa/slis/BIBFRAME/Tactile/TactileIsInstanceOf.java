package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIsInstanceOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIsInstanceOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIsInstanceOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileIsInstanceOfIterator theTactileIsInstanceOfIterator = (TactileIsInstanceOfIterator)findAncestorWithClass(this, TactileIsInstanceOfIterator.class);
			pageContext.getOut().print(theTactileIsInstanceOfIterator.getIsInstanceOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for isInstanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for isInstanceOf tag ");
		}
		return SKIP_BODY;
	}
}

