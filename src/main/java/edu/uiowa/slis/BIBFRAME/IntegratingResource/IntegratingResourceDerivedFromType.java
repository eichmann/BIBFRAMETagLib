package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceDerivedFromIterator theIntegratingResourceDerivedFromIterator = (IntegratingResourceDerivedFromIterator)findAncestorWithClass(this, IntegratingResourceDerivedFromIterator.class);
			pageContext.getOut().print(theIntegratingResourceDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

