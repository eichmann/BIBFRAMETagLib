package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSupersededByIterator theDissertationSupersededByIterator = (DissertationSupersededByIterator)findAncestorWithClass(this, DissertationSupersededByIterator.class);
			pageContext.getOut().print(theDissertationSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

