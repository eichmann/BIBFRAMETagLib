package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceAbsorbedByIterator theContinuingResourceAbsorbedByIterator = (ContinuingResourceAbsorbedByIterator)findAncestorWithClass(this, ContinuingResourceAbsorbedByIterator.class);
			pageContext.getOut().print(theContinuingResourceAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

