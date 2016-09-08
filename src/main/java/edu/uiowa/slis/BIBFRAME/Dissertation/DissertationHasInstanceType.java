package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasInstanceIterator theDissertationHasInstanceIterator = (DissertationHasInstanceIterator)findAncestorWithClass(this, DissertationHasInstanceIterator.class);
			pageContext.getOut().print(theDissertationHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

