package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationDerivedFromIterator theDissertationDerivedFromIterator = (DissertationDerivedFromIterator)findAncestorWithClass(this, DissertationDerivedFromIterator.class);
			pageContext.getOut().print(theDissertationDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

