package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionFormDesignationIterator theCollection = (CollectionFormDesignationIterator)findAncestorWithClass(this, CollectionFormDesignationIterator.class);
			pageContext.getOut().print(theCollection.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

