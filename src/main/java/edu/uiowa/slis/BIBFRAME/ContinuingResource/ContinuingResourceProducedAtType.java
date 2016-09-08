package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceProducedAtIterator theContinuingResourceProducedAtIterator = (ContinuingResourceProducedAtIterator)findAncestorWithClass(this, ContinuingResourceProducedAtIterator.class);
			pageContext.getOut().print(theContinuingResourceProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

