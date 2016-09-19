package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasDerivativeIterator theCollectionHasDerivativeIterator = (CollectionHasDerivativeIterator)findAncestorWithClass(this, CollectionHasDerivativeIterator.class);
			pageContext.getOut().print(theCollectionHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

