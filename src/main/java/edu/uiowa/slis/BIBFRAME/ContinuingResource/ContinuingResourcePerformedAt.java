package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourcePerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourcePerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourcePerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourcePerformedAtIterator theContinuingResourcePerformedAtIterator = (ContinuingResourcePerformedAtIterator)findAncestorWithClass(this, ContinuingResourcePerformedAtIterator.class);
			pageContext.getOut().print(theContinuingResourcePerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

