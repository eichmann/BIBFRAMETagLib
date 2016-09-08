package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSupplementsIterator theContinuingResourceSupplementsIterator = (ContinuingResourceSupplementsIterator)findAncestorWithClass(this, ContinuingResourceSupplementsIterator.class);
			pageContext.getOut().print(theContinuingResourceSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for supplements tag ");
		}
		return SKIP_BODY;
	}
}

