package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionAccompaniesIterator theCollectionAccompaniesIterator = (CollectionAccompaniesIterator)findAncestorWithClass(this, CollectionAccompaniesIterator.class);
			pageContext.getOut().print(theCollectionAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

