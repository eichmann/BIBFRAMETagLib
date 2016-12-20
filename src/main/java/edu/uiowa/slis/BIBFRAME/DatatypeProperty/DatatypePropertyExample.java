package edu.uiowa.slis.BIBFRAME.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyExample extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypePropertyExample currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyExample.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyExampleIterator theDatatypeProperty = (DatatypePropertyExampleIterator)findAncestorWithClass(this, DatatypePropertyExampleIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getExample());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for example tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for example tag ");
		}
		return SKIP_BODY;
	}
}

