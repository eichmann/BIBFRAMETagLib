package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceDerivedFromIterator theContinuingResourceDerivedFromIterator = (ContinuingResourceDerivedFromIterator)findAncestorWithClass(this, ContinuingResourceDerivedFromIterator.class);
			pageContext.getOut().print(theContinuingResourceDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

