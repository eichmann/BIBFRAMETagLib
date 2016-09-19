package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceRelationInverseIterator theContinuingResourceRelationInverseIterator = (ContinuingResourceRelationInverseIterator)findAncestorWithClass(this, ContinuingResourceRelationInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for relation tag ");
		}
		return SKIP_BODY;
	}
}

