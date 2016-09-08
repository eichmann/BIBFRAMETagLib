package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasAbsorbedIterator theContinuingResourceHasAbsorbedIterator = (ContinuingResourceHasAbsorbedIterator)findAncestorWithClass(this, ContinuingResourceHasAbsorbedIterator.class);
			pageContext.getOut().print(theContinuingResourceHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

