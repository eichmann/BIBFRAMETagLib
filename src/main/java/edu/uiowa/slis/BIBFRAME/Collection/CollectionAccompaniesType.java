package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionAccompaniesIterator theCollectionAccompaniesIterator = (CollectionAccompaniesIterator)findAncestorWithClass(this, CollectionAccompaniesIterator.class);
			pageContext.getOut().print(theCollectionAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

