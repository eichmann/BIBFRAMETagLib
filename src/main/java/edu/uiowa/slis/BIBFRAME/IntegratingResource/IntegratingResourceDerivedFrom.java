package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceDerivedFromIterator theIntegratingResourceDerivedFromIterator = (IntegratingResourceDerivedFromIterator)findAncestorWithClass(this, IntegratingResourceDerivedFromIterator.class);
			pageContext.getOut().print(theIntegratingResourceDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

